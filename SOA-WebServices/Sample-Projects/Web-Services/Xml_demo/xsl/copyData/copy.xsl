<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output method="xml"/>

 <xsl:template match="eu">
  
  <xsl:apply-templates select="member"/>
   
 </xsl:template>

 <!--xsl:template match="member">
   <xsl:apply-templates select="state[2]"/>
 </xsl:template-->

 <xsl:template match="member">   
  <xsl:copy>
  <xsl:comment>
   <xsl:text>Member states: </xsl:text>
   <xsl:value-of select="count(state)"/>
  </xsl:comment>
  </xsl:copy>
   
 </xsl:template>

</xsl:stylesheet>
