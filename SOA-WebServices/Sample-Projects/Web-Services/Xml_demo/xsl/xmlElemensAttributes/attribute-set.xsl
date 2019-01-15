<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output method="xml" indent="yes"/>

<xsl:attribute-set name="paraAttrib">
  <xsl:attribute name="priority">medium</xsl:attribute>
  <xsl:attribute name="date">2003-09-23</xsl:attribute>
  <xsl:attribute name="doc:style" namespace="http://www.server.com/documents">
      classic Data
  </xsl:attribute>
</xsl:attribute-set>

<xsl:template match="/">
   <xsl:element name="para" use-attribute-sets="paraAttrib">
      <xsl:element name="strong" use-attribute-sets="paraAttrib">  
      <!--Reuse the attribute-set-->
      <xsl:apply-templates/>
      </xsl:element>
 </xsl:element>
  
  
</xsl:template>

</xsl:stylesheet>
