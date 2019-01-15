<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">


<xsl:include href="include.xsl"/>

<xsl:import href="add.xsl"/>

<xsl:output method="xml" indent="yes"/>

<xsl:template match="PopulationChange">
 <xsl:element name="topStates">
  <xsl:apply-templates select="State"/>
  <xsl:apply-templates select="State/Budget"/>
 </xsl:element>
</xsl:template>

<!--xsl:template match="PopulationChange">
 <xsl:text>The Data from second template .</xsl:text>
 <xsl:call-template name="n1"/>
 <xsl:text>Source: US Census Bureau</xsl:text>
 <xsl:call-template name="n2"/>
 <xsl:apply-templates select="State"/>
 <xsl:apply-imports/>
</xsl:template-->


<xsl:template match="State">
 <xsl:element name="stateData">
  <xsl:element name="stateRank">
   <xsl:value-of select="Rank"/>
  </xsl:element>
  <xsl:element name="stateName">
   <xsl:value-of select="Name"/>
  </xsl:element>
  <xsl:apply-imports/>
 </xsl:element>
</xsl:template>

</xsl:stylesheet>
