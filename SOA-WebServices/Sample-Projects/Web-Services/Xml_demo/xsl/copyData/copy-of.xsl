<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output method="xml"/>

 <xsl:template match="eu">
  <xsl:apply-templates select="member"/>
 </xsl:template>

 <xsl:template match="member">
   <xsl:apply-templates select="state[2]"/>
 </xsl:template>

 <xsl:template match="state">
  <xsl:copy-of select="."/>
 </xsl:template>

</xsl:stylesheet>
