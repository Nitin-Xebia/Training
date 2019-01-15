<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output method="xml" indent="yes"/>

<xsl:template match="/">
 <xsl:element name="doc:paragraph" namespace="http://www.serverIndia.com/documents">
  <xsl:apply-templates/>
 </xsl:element>
</xsl:template>

</xsl:stylesheet>
