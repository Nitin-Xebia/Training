<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output method="xml" indent="yes" encoding="UTF-8"/>
<xsl:output doctype-system="name.dtd"/>

<xsl:template match="name">
 <name>
  <family><xsl:apply-templates select="last"/></family>
  <given><xsl:apply-templates select="first"/></given>
 </name>
</xsl:template>

</xsl:stylesheet>
