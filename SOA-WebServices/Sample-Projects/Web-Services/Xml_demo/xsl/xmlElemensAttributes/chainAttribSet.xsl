<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output method="xml" indent="yes"/>

<xsl:attribute-set name="doc" use-attribute-sets="paragraph">
 <xsl:attribute name="doc:style" namespace= "http://www.server.net/documents">
      classicData is here!
  </xsl:attribute>
</xsl:attribute-set>

<xsl:attribute-set name="paragraph"> 
 <xsl:attribute name="date">2003-09-23</xsl:attribute>
 <xsl:attribute name="priority">medium</xsl:attribute>
</xsl:attribute-set>

<xsl:template match="/">
 <xsl:element name="paragraph" use-attribute-sets="doc">
  <xsl:apply-templates/>
 </xsl:element>
</xsl:template>

</xsl:stylesheet>
