<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output method="html" omit-xml-declaration="yes"/>

<xsl:template match="/">
 <html>
 <body>
 <p>
 <xsl:value-of select="title"/>
 <xsl:text disable-output-escaping="no"> &amp; Associates</xsl:text>
 <!--If 'yes' expands the caharcter entity in the output-->
 </p>
 </body>
 </html>
</xsl:template>

</xsl:stylesheet>
