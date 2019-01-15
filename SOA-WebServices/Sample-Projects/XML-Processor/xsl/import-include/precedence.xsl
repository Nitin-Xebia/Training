<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:import href="second.xsl"/>
<xsl:import href="first.xsl"/>

<xsl:output method="text"/>

<xsl:template match="PopulationChange">
 <xsl:text>Population Change: July 1, 2001 to July 1, 2002</xsl:text>
 <xsl:call-template name="n1"/>
 <xsl:text>Source: US State Dept</xsl:text>
 <xsl:call-template name="n2"/>
 <xsl:apply-templates select="State"/>
</xsl:template>

</xsl:stylesheet>
