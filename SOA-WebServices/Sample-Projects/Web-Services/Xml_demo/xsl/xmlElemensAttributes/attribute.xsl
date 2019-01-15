<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output method="xml" indent="yes"/>

<!--create xml element indent formatting-->

<xsl:template match="/">
 <xsl:element name="paragraph">
  <xsl:attribute name="priority">
         medium
   </xsl:attribute>
   <xsl:apply-templates/>
 </xsl:element>
</xsl:template>

</xsl:stylesheet>
