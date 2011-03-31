
/**
 * Extension point, initially generated by Mod4j. 
 *     Time             : Thu Mar 04 18:17:49 CET 2010
 *     Application model: MyDerived
 *     Generator        :  Mod4j BusinessDomainDsl generator: NewJavaBean.xpt
 *
 * It is intended to customize and maintain this file by hand. 
 * If you remove this file, it will be regenerated by Mod4j to its original state.
 */

package org.company.recordshop.bd.domain;

import org.joda.time.DateTime;

/**
 * Test derived attributes
 *
 * @author Generated by Mod4j BusinessDomain DSL
 */
@SuppressWarnings("serial")
public class MyDerived extends MyDerivedImplBase {

	/**
	 * Minimal constructor for MyDerived
	 */
	public MyDerived(

	) {
		super(

		);
	}
	
	/**
     * Creates a MyDerived with the specified ID.
     */
    protected MyDerived(Long id) {
        super(id);
    }

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getFirst() {
		// TODO Mod4j: add derivation rule for derived attribute first
		return null;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Boolean isSecondo() {
		// TODO Mod4j: add derivation rule for derived attribute secondo
		return true;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DateTime getThird() {
		// TODO Mod4j: add derivation rule for derived attribute third
		return null;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer getFourth() {
		// TODO Mod4j: add derivation rule for derived attribute fourth
		return null;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Float getFifth() {
		// TODO Mod4j: add derivation rule for derived attribute fifth
		return 0F;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Color getClr() {
		// TODO Mod4j: add derivation rule for derived attribute clr
		return null;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void setSecondo(final Boolean secondo) {
		// TODO Mod4j: add setter rule for writable derived attribute secondo
		validation.validate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void setFourth(final Integer fourth) {
		// TODO Mod4j: add setter rule for writable derived attribute fourth
		validation.validate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void setClr(final Color clr) {
		// TODO Mod4j: add setter rule for writable derived attribute clr
		validation.validate();
	}

}
