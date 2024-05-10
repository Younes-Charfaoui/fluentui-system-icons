package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.EditOff16: ImageVector
  get() {
    if (_editOff16 != null) {
      return _editOff16!!
    }
    _editOff16 = fluentIcon(name = "Filled.EditOff16", 16f) {
      materialPath {
          moveTo(9.5F, 10.207F)
          lineToRelative(4.646F, 4.647F)
          curveToRelative(0.196F, 0.195F, 0.512F, 0.195F, 0.708F, 0.0F)
          curveToRelative(0.195F, -0.196F, 0.195F, -0.512F, 0.0F, -0.708F)
          lineToRelative(-13.0F, -13.0F)
          curveToRelative(-0.196F, -0.195F, -0.512F, -0.195F, -0.708F, 0.0F)
          curveToRelative(-0.195F, 0.196F, -0.195F, 0.512F, 0.0F, 0.708F)
          lineTo(5.793F, 6.5F)
          lineTo(2.657F, 9.636F)
          curveToRelative(-0.374F, 0.374F, -0.64F, 0.841F, -0.772F, 1.354F)
          lineToRelative(-0.87F, 3.386F)
          curveToRelative(-0.043F, 0.17F, 0.007F, 0.352F, 0.132F, 0.477F)
          curveToRelative(0.124F, 0.125F, 0.306F, 0.175F, 0.477F, 0.131F)
          lineToRelative(3.386F, -0.869F)
          curveToRelative(0.512F, -0.131F, 0.98F, -0.398F, 1.354F, -0.772F)
          lineTo(9.5F, 10.207F)
          close()
          moveToRelative(3.25F, -3.25F)
          lineToRelative(-1.836F, 1.836F)
          lineToRelative(-3.707F, -3.707F)
          lineTo(9.043F, 3.25F)
          lineToRelative(3.707F, 3.707F)
          close()
          moveToRelative(-2.221F, -5.193F)
          curveToRelative(1.024F, -1.024F, 2.683F, -1.024F, 3.707F, 0.0F)
          reflectiveCurveToRelative(1.024F, 2.683F, 0.0F, 3.707F)
          lineTo(13.457F, 6.25F)
          lineTo(9.75F, 2.543F)
          lineToRelative(0.779F, -0.78F)
          close()        
      }
    }
    return _editOff16!!
  }

private var _editOff16: ImageVector? = null
