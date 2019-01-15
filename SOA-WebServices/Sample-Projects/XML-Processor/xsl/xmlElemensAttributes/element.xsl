<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output method="xml" indent="yes"/>

<xsl:template match="message">
 <xsl:element name="{concat('my', name())}">
 <!--Concat 'my' with name of current element(context) i.e.'message'
 and insert into output result tree-->
    <xsl:apply-templates/>
 </xsl:element>
</xsl:template>

</xsl:stylesheet>
