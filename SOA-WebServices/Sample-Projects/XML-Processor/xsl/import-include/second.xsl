<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:import href="wspace.xsl"/>

<xsl:template match="State">
 <xsl:text>State2:</xsl:text>
 <xsl:call-template name="sp1"/>
 <xsl:value-of select="Name"/>
 <xsl:call-template name="n1"/>
 <xsl:text>Rank2:</xsl:text>
 <xsl:call-template name="sp1"/>
 <xsl:value-of select="Rank"/>
 <xsl:call-template name="n2"/>
</xsl:template>

</xsl:stylesheet>
