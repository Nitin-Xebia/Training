<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

<xsl:include href="wspace.xsl"/>
<!--xsl:output method="text"/-->

<xsl:template match="PopulationChange">
 <xsl:text>Census Data from incuded ref.</xsl:text>
 <xsl:call-template name="n1"/>
 <xsl:text>Source: US Census Bureau</xsl:text>
 <xsl:call-template name="n2"/>
 <xsl:apply-templates select="State"/>
</xsl:template>


<xsl:template match="State">
 <xsl:text>State:</xsl:text>
 <xsl:call-template name="sp1"/>
 <xsl:value-of select="Name"/>
 <xsl:call-template name="n1"/>
 <xsl:text>Rank:</xsl:text>
 <xsl:call-template name="sp1"/>
 <xsl:value-of select="Rank"/>
 <xsl:call-template name="n2"/>
</xsl:template>

</xsl:stylesheet>
