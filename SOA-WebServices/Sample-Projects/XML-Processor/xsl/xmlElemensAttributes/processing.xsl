<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output method="xml" indent="yes"/>

 <xsl:template match="/">
  <xsl:processing-instruction name="xml-stylesheet">href="processing.css" type="text/css"</xsl:processing-instruction>
  <xsl:element name="doc">
    <xsl:element name="paragraph">
     <xsl:apply-templates/>
    </xsl:element>
  </xsl:element>
 </xsl:template>

<xsl:template match="courier">
  <xsl:element name="code">
     <xsl:apply-templates/>
   </xsl:element>
</xsl:template>

</xsl:stylesheet>
