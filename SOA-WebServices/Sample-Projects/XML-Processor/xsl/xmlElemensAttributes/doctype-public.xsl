<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output method="xml" indent="yes" encoding="UTF-8"/>
<xsl:output doctype-public="-//W3C//DTD XHTML 1.0 Strict//EN"/>
<xsl:output doctype-system="http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd"/>

<xsl:template match="name">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
 <title><xsl:value-of select="name()"/></title>
</head>
<body>
  <p><xsl:apply-templates select="last"/></p>
  <p><xsl:apply-templates select="first"/></p>
</body>
</html>
</xsl:template>

</xsl:stylesheet>
