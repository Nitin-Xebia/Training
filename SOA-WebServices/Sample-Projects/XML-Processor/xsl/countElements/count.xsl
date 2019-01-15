<?xml version="1.0"?>

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:template match="/">
            <h2><xsl:text>The book list by Name is </xsl:text></h2>
	    <p>
            <xsl:for-each select="books/book">
              <p><xsl:value-of select="name"/></p><!--Case sensitive-->
             </xsl:for-each>
            </p>

	        <b><xsl:text>The books summary</xsl:text></b>
		<p>
		  Books with Review of 3.5 = <xsl:value-of select="count(books/book[review=3.5])"/>
		</p>
		<p>
		   Books Review of 4 = <xsl:value-of select="count(books/book[review=4])"/>
		</p>	
		<p>
		  Books with prices > 100 = <xsl:value-of select="count(books/book[price>100])"/>
		</p>
	</xsl:template>
</xsl:stylesheet>