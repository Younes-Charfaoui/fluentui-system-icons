package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.ChevronDoubleLeft20: ImageVector
  get() {
    if (_chevronDoubleLeft20 != null) {
      return _chevronDoubleLeft20!!
    }
    _chevronDoubleLeft20 = fluentIcon(name = "Filled.ChevronDoubleLeft20", 20f) {
      materialPath {
          moveTo(11.269F, 15.794F)
          curveToRelative(-0.3F, 0.286F, -0.775F, 0.274F, -1.06F, -0.026F)
          lineToRelative(-5.002F, -5.25F)
          curveToRelative(-0.276F, -0.29F, -0.276F, -0.745F, 0.0F, -1.035F)
          lineToRelative(5.001F, -5.25F)
          curveToRelative(0.286F, -0.3F, 0.76F, -0.312F, 1.06F, -0.026F)
          curveToRelative(0.3F, 0.286F, 0.312F, 0.76F, 0.026F, 1.06F)
          lineToRelative(-4.508F, 4.734F)
          lineToRelative(4.508F, 4.733F)
          curveToRelative(0.286F, 0.3F, 0.274F, 0.774F, -0.025F, 1.06F)
          close()
          moveToRelative(4.0F, 0.001F)
          curveToRelative(-0.3F, 0.286F, -0.774F, 0.274F, -1.06F, -0.026F)
          lineToRelative(-5.001F, -5.25F)
          curveToRelative(-0.276F, -0.29F, -0.276F, -0.745F, 0.0F, -1.035F)
          lineToRelative(5.001F, -5.25F)
          curveToRelative(0.286F, -0.3F, 0.76F, -0.312F, 1.06F, -0.026F)
          curveToRelative(0.3F, 0.286F, 0.312F, 0.76F, 0.026F, 1.06F)
          lineToRelative(-4.508F, 4.733F)
          lineToRelative(4.508F, 4.734F)
          curveToRelative(0.286F, 0.3F, 0.274F, 0.774F, -0.025F, 1.06F)
          close()        
      }
    }
    return _chevronDoubleLeft20!!
  }

private var _chevronDoubleLeft20: ImageVector? = null
