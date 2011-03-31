package org.company.recordshop.bd.data;

import java.util.List;

import junit.framework.Assert;

import org.company.recordshop.bd.data.ChildDao;
import org.company.recordshop.bd.data.RootDao;
import org.company.recordshop.bd.domain.Child;
import org.company.recordshop.bd.domain.ChildExample;
import org.company.recordshop.bd.domain.GrandChild;
import org.company.recordshop.bd.domain.GrandChildExample;
import org.company.recordshop.bd.domain.Root;
import org.company.recordshop.bd.domain.RootExample;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Eric Jan Malotaux
 */
public class FindByExampleChildTest extends AbstractDaoTestCase {

    @Autowired
    private RootDao rootDao;

    @Autowired
    private ChildDao childDao;

    private Long rootId;

    @Before
    public void setUp() {
        Root root = new Root("root");
        Root parent = new Root("parent");
        Root recursiveRoot = new Root("recursiveRoot");
        Root doubleRecursiveRoot = new Root("doubleRecursive");
        Child child = new Child("child");
        GrandChild grandChild = new GrandChild("grandChild");
        root.setChild(child);
        child.setParent(parent);
        root.setRoot(recursiveRoot);
        recursiveRoot.setRoot(doubleRecursiveRoot);
        child.setGrandChild(grandChild);
        rootId = rootDao.add(root);
        rootDao.add(parent);
        flush();
        clear();
        root = rootDao.retrieve(rootId);
        Assert.assertEquals("root", root.getName());
        Assert.assertEquals("child", root.getChild().getName());
        Assert.assertEquals("grandChild", root.getChild().getGrandChild().getName());
        Assert.assertEquals("recursiveRoot", root.getRoot().getName());
        Assert.assertEquals("doubleRecursive", root.getRoot().getRoot().getName());
    }

    @Test
    public void testFindByExampleNoMatch() {
        RootExample root = new RootExample();
        ChildExample child = new ChildExample();
        GrandChild grandChild = new GrandChildExample();

        root.setChild(child);
        child.setGrandChild(grandChild);
        grandChild.setName("nonsense");
        List<Root> result = rootDao.findByExample(root);
        Assert.assertEquals(0, result.size());
    }

    @Test
    public void testFindByExampleMatch() {
        RootExample root = new RootExample();
        ChildExample child = new ChildExample();
        GrandChild grandChild = new GrandChildExample();

        grandChild.setName("grandChild");
        root.setChild(child);
        child.setGrandChild(grandChild);
        List<Root> result = rootDao.findByExample(root);
        Assert.assertEquals(1, result.size());
    }

    @Test
    public void testFindByExampleRecursiveNoMatch() {
        RootExample root = new RootExample();
        RootExample recursiveRoot = new RootExample();

        recursiveRoot.setName("nonsense");
        root.setRoot(recursiveRoot);
        List<Root> result = rootDao.findByExample(root);
        Assert.assertEquals(0, result.size());
    }

    @Test
    public void testFindByExampleRecursiveMatch() {
        RootExample root = new RootExample();
        RootExample recursiveRoot = new RootExample();

        recursiveRoot.setName("recursiveRoot");
        root.setRoot(recursiveRoot);
        List<Root> result = rootDao.findByExample(root);
        Assert.assertEquals(1, result.size());
    }

    @Test
    public void testFindByExampleDoubleRecursiveNoMatch() {
        RootExample root = new RootExample();
        RootExample recursiveRoot = new RootExample();
        RootExample doubleRecursive = new RootExample();

        doubleRecursive.setName("nonsense");
        root.setRoot(recursiveRoot);
        recursiveRoot.setRoot(doubleRecursive);
        List<Root> result = rootDao.findByExample(root);
        Assert.assertEquals(0, result.size());
    }

    @Test
    public void testFindByExampleDoubleRecursiveMatch() {
        RootExample root = new RootExample();
        RootExample recursiveRoot = new RootExample();
        RootExample doubleRecursive = new RootExample();

        doubleRecursive.setName("doubleRecursive");
        root.setRoot(recursiveRoot);
        recursiveRoot.setRoot(doubleRecursive);
        List<Root> result = rootDao.findByExample(root);
        Assert.assertEquals(1, result.size());
    }

    @Test
    public void testFindByExampleComplexDoubleRecursiveNoMatch() {
        RootExample root = new RootExample();
        RootExample recursiveRoot = new RootExample();
        RootExample doubleRecursive = new RootExample();
        ChildExample childExample = new ChildExample();
        GrandChildExample grandChildExample = new GrandChildExample();

        doubleRecursive.setName("doubleRecursive");
        grandChildExample.setName("nonsense");
        root.setRoot(recursiveRoot);
        root.setChild(childExample);
        childExample.setGrandChild(grandChildExample);
        recursiveRoot.setRoot(doubleRecursive);
        List<Root> result = rootDao.findByExample(root);
        Assert.assertEquals(0, result.size());
    }

    @Test
    public void testFindByExampleComplexDoubleRecursiveMatch() {
        RootExample root = new RootExample();
        RootExample recursive = new RootExample();
        RootExample doubleRecursive = new RootExample();
        ChildExample child = new ChildExample();
        GrandChildExample grandChild = new GrandChildExample();
        doubleRecursive.setName("doubleRecursive");
        grandChild.setName("grandChild");

        root.setRoot(recursive);
        recursive.setRoot(doubleRecursive);
        root.setChild(child);
        child.setGrandChild(grandChild);
        recursive.setRoot(doubleRecursive);

        List<Root> result = rootDao.findByExample(root);
        Assert.assertEquals(1, result.size());
    }

    @Test
    public void testFindByExampleAssociationFromNoMatch() {
        ChildExample child = new ChildExample();
        RootExample parent = new RootExample();
        child.setParent(parent);
        parent.setName("noMatch");
        
        List<Child> result = childDao.findByExample(child);
        Assert.assertEquals(0, result.size());
    }

    @Test
    public void testFindByExampleAssociationFromMatch() {
        ChildExample child = new ChildExample();
        RootExample parent = new RootExample();
        child.setParent(parent);
        parent.setName("parent");
        
        List<Child> result = childDao.findByExample(child);
        Assert.assertEquals(1, result.size());
        Assert.assertEquals(1, childDao.countByExample(child, null));
    }
}
