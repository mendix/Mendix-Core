package org.mod4j.runtime.hibernate;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.cfg.ImprovedNamingStrategy;
import org.hibernate.cfg.NamingStrategy;

/**
 * @author Eric Jan Malotaux
 */
public class Mod4jNamingStrategy extends ImprovedNamingStrategy {
    private static Log logger = LogFactory.getLog(Mod4jNamingStrategy.class);

    /**
     * A convenient singleton instance
     */
    public static final NamingStrategy INSTANCE = new Mod4jNamingStrategy();

    /**
     * {@inheritDoc}
     */
    @Override
    public String classToTableName(String className) {
        String result = super.classToTableName(className) + "_table";
        if (logger.isDebugEnabled()) {
            logger.debug("className=" + className);
            logger.debug("result=" + result);
        }
        return result;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String collectionTableName(String ownerEntity, String ownerEntityTable, String associatedEntity,
            String associatedEntityTable, String propertyName) {
        String collectionTableName = super.collectionTableName(ownerEntity, ownerEntityTable, associatedEntity,
                associatedEntityTable, propertyName);
        if (logger.isDebugEnabled()) {
            logger.debug("ownerEntity=" + ownerEntity);
            logger.debug("ownerEntityTable=" + ownerEntityTable);
            logger.debug("associatedEntity=" + associatedEntity);
            logger.debug("associatedEntityTable=" + associatedEntityTable);
            logger.debug("propertyName=" + propertyName);
            logger.debug("result=" + collectionTableName);
        }
        return collectionTableName;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String columnName(String columnName) {
        String result = super.columnName(columnName);
        if (logger.isDebugEnabled()) {
            logger.debug("columnName=" + columnName);
            logger.debug("result=" + result);
        }
        return result;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String foreignKeyColumnName(String propertyName, String propertyEntityName, String propertyTableName,
            String referencedColumnName) {
        String result = super.foreignKeyColumnName(propertyName, propertyEntityName, propertyTableName,
                referencedColumnName);
        if (logger.isDebugEnabled()) {
            logger.debug("propertyName=" + propertyName);
            logger.debug("propertyEntityName=" + propertyEntityName);
            logger.debug("propertyTableName=" + propertyTableName);
            logger.debug("referencedColumnName=" + referencedColumnName);
            logger.debug("result=" + result);
        }
        return result;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String joinKeyColumnName(String joinedColumn, String joinedTable) {
        String result = super.joinKeyColumnName(joinedColumn, joinedTable);
        if (logger.isDebugEnabled()) {
            logger.debug("joinedColumn=" + joinedColumn);
            logger.debug("joinedTable=" + joinedTable);
            logger.debug("result=" + result);
        }
        return result;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String logicalCollectionColumnName(String columnName, String propertyName, String referencedColumn) {
        String result = super.logicalCollectionColumnName(columnName, propertyName, referencedColumn);
        if (logger.isDebugEnabled()) {
            logger.debug("columnName=" + columnName);
            logger.debug("propertyName=" + propertyName);
            logger.debug("referencedColumn=" + referencedColumn);
            logger.debug("result=" + result);
        }
        return result;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String logicalCollectionTableName(String tableName, String ownerEntityTable, String associatedEntityTable,
            String propertyName) {
        String result = super.logicalCollectionTableName(tableName, ownerEntityTable, associatedEntityTable,
                propertyName);
        if (logger.isDebugEnabled()) {
            logger.debug("tableName=" + tableName);
            logger.debug("ownerEntityTable=" + ownerEntityTable);
            logger.debug("associatedEntityTable=" + associatedEntityTable);
            logger.debug("propertyName=" + propertyName);
            logger.debug("result=" + result);
        }
        return result;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String logicalColumnName(String columnName, String propertyName) {
        String result = super.logicalColumnName(columnName, propertyName);
        if (logger.isDebugEnabled()) {
            logger.debug("columnName=" + columnName);
            logger.debug("propertyName=" + propertyName);
            logger.debug("result=" + result);
        }
        return result;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String propertyToColumnName(String propertyName) {
        String result = super.propertyToColumnName(propertyName);
        if (logger.isDebugEnabled()) {
            logger.debug("propertyName=" + propertyName);
            logger.debug("result=" + result);
        }
        return result;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String tableName(String tableName) {
        String result = super.tableName(tableName);
        if (logger.isDebugEnabled()) {
            logger.debug("tableName=" + tableName);
            logger.debug("result=" + result);
        }
        return result;
    }
}
