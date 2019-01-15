<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output method="xml" indent="yes"/>

<xsl:template match="/">
 <xsl:element name="paragraph">
  <xsl:attribute name="priority">medium</xsl:attribute>
  <xsl:attribute name="date">2003-09-23</xsl:attribute>
  <xsl:attribute name="doc:style" namespace="http://www.myServer.org/documents">
        classic Attribute!
   </xsl:attribute>
   <xsl:apply-templates/>
 </xsl:element>
</xsl:template>

</xsl:stylesheet>
