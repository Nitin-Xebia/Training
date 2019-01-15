<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output method="html"/>
<xsl:decimal-format name="de" decimal-separator="," grouping-separator="."/> 
<xsl:decimal-format name="fr" decimal-separator="," grouping-separator=" "/> 
<xsl:decimal-format name="ru" decimal-separator="," grouping-separator=" "/> 
<xsl:decimal-format name="uk" decimal-separator="." grouping-separator=","/> 
<xsl:decimal-format name="us" decimal-separator="." grouping-separator=","/> 

<xsl:template match="format">
 <html>
 <head>
 <title>Number Formatter</title>
 <style type="text/css">
 table {margin-left:auto;margin-right:auto}
 td {text-align:right;padding: 5px 5px 5px 5px}
 h3 {text-align:center}
 </style>
 </head>
 <body>
 <h3>Number Formatter</h3>
 <table rules="all">
 <thead>
 <tr>
  <th>Deutschland</th>
  <th>France</th>
  <th>&#x420;&#x43E;&#x441;&#x441;&#x438;&#x44f;</th> <!-- Russia -->
  <th>United Kingdom</th>
  <th>United States</th>
 </tr>
 </thead>
 <tbody>
 <xsl:apply-templates select="number"/>
 </tbody>
 </table>
 </body>
 </html>
</xsl:template>

<xsl:template match="number">
 <tr> 
 <td><xsl:value-of select="format-number(.,'.###,00&#x20AC;','de')"/></td>
 <td><xsl:value-of select="format-number(.,' ###,00&#x20AC;','fr')"/></td>
 <td><xsl:value-of select="format-number(.,' ###,00p.','ru')"/></td>
 <td><xsl:value-of select="format-number(.,'&#xA3;,###.00','uk')"/></td>
 <td><xsl:value-of select="format-number(.,'&#x24;,###.00','us')"/></td>
 </tr>
</xsl:template>

</xsl:stylesheet>
