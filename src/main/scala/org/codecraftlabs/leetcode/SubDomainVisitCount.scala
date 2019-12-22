package org.codecraftlabs.leetcode

import scala.collection.mutable

object SubDomainVisitCount {
  def subDomainVisits(domains: Array[String]): List[String] = {
    val mappings = mutable.Map[String, Long]()
    domains.foreach(i => splitDomains(i, mappings))
    mappings.map(i => i._2.toString + " " + i._1).toList
  }

  private def splitDomains(domain: String, mapping: mutable.Map[String, Long]): Unit = {
    val items = domain.split(" ").map(_.trim)
    val counter = items(0).toLong
    val url = items(1)

    val urlPieces = url.split("\\.").map(_.trim).reverse
    var buffer: String = ""
    urlPieces.foreach(item => {
        val temp = item + "."
        buffer = temp + buffer
        val currentValue: Long = mapping.getOrElse(buffer.toString().stripPrefix("."), 0)
        val total = currentValue + counter
        mapping.put(buffer.toString().stripPrefix("."), total)
    })
  }
}
