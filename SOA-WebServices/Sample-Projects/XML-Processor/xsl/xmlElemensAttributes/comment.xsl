<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output method="xml" indent="yes"/>

 <xsl:template match="/">
  <xsl:comment> comment &amp; msg element </xsl:comment>
   <msg>
     <xsl:apply-templates/>
   </msg>
 </xsl:template>

</xsl:stylesheet>
