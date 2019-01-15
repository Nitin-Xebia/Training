<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

<xsl:template match="State">
 <xsl:element name="dataAdvice">
  <xsl:text>July 2002 estimated population was </xsl:text>
  <xsl:value-of select="Population"/>
  <xsl:text>.</xsl:text>
 </xsl:element>
</xsl:template>
 <xsl:template match="State/Budget">
   <xsl:text>The annual budget is </xsl:text>
    <xsl:value-of select="."/>
  </xsl:template>


</xsl:stylesheet>
