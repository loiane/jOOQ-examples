/**
 * This class is generated by jOOQ
 */
package com.loiane.mysql.generatedclasses.enums;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public enum CountryContinent implements org.jooq.EnumType {

	Asia("Asia"),

	Europe("Europe"),

	North_America("North America"),

	Africa("Africa"),

	Oceania("Oceania"),

	Antarctica("Antarctica"),

	South_America("South America"),

	;

	private final java.lang.String literal;

	private CountryContinent(java.lang.String literal) {
		this.literal = literal;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Schema getSchema() {
		return null;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String getName() {
		return "Country_Continent";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String getLiteral() {
		return literal;
	}
}
