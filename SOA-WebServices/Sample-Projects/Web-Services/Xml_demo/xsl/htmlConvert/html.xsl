<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output method="html" indent="yes"/>

<xsl:template match="/">
 <html>
  <head>
   <title>HTML Output</title>
  </head>
  <body>
   <p><xsl:apply-templates/></p>
   <!--Retrieve the current and child elements text and insert into the
     output-->
  </body>
 </html>
</xsl:template>

</xsl:stylesheet>
