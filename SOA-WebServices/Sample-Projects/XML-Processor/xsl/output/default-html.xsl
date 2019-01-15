<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

<xsl:template match="name">
 <html>
  <body>
  <p><xsl:apply-templates select="last"/></p>
  <p><xsl:apply-templates select="first"/></p>
  </body>
 </html>
</xsl:template>

</xsl:stylesheet>
