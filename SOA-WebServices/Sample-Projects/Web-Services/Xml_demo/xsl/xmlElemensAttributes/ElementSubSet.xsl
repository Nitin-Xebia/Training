<?xml version='1.0' encoding='utf-8' ?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output method="xml"/>

<xsl:template match="/">
	<customers>
	<xsl:apply-templates select="/customers/customer" />
	</customers>
</xsl:template>


<xsl:template match="customers">
	<xsl:apply-templates/>
</xsl:template>

<xsl:template match="customer">
	<customer>
		<CompanyName>
			<xsl:value-of select="@CompanyName"/>
		</CompanyName>
		<CustomerID>
			<xsl:value-of select="@CustomerID"/>
		</CustomerID>
		<Country>
			<xsl:value-of select="@Country"/>
		</Country>
	</customer>
	<xsl:apply-templates/>
</xsl:template>

</xsl:stylesheet>
