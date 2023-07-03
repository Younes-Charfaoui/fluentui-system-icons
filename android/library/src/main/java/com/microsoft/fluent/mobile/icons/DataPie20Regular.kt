package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.DataPie20: ImageVector
  get() {
    if (_dataPie20 != null) {
      return _dataPie20!!
    }
    _dataPie20 = fluentIcon(name = "Regular.DataPie20", 20f) {
      materialPath {
          moveTo(9.0F, 12.0F)
          curveToRelative(-0.552F, 0.0F, -1.0F, -0.448F, -1.0F, -1.0F)
          verticalLineTo(5.083F)
          curveTo(5.163F, 5.558F, 3.0F, 8.027F, 3.0F, 11.0F)
          curveToRelative(0.0F, 3.314F, 2.686F, 6.0F, 6.0F, 6.0F)
          curveToRelative(2.973F, 0.0F, 5.442F, -2.163F, 5.917F, -5.0F)
          horizontalLineTo(9.0F)
          close()
          moveTo(8.003F, 4.07F)
          curveTo(8.55F, 3.992F, 9.0F, 4.448F, 9.0F, 5.0F)
          verticalLineToRelative(6.0F)
          horizontalLineToRelative(6.0F)
          curveToRelative(0.552F, 0.0F, 1.008F, 0.45F, 0.93F, 0.997F)
          curveTo(15.446F, 15.391F, 12.527F, 18.0F, 9.0F, 18.0F)
          curveToRelative(-3.866F, 0.0F, -7.0F, -3.134F, -7.0F, -7.0F)
          curveToRelative(0.0F, -3.527F, 2.61F, -6.446F, 6.003F, -6.93F)
          close()
          moveTo(11.0F, 9.0F)
          verticalLineTo(3.0F)
          curveToRelative(3.314F, 0.0F, 6.0F, 2.686F, 6.0F, 6.0F)
          horizontalLineToRelative(-6.0F)
          close()
          moveToRelative(6.062F, 1.0F)
          curveToRelative(0.498F, 0.0F, 0.927F, -0.366F, 0.937F, -0.864F)
          lineTo(18.0F, 9.0F)
          curveToRelative(0.0F, -3.866F, -3.134F, -7.0F, -7.0F, -7.0F)
          lineToRelative(-0.136F, 0.001F)
          curveTo(10.366F, 2.011F, 10.0F, 2.441F, 10.0F, 2.938F)
          verticalLineTo(9.0F)
          curveToRelative(0.0F, 0.552F, 0.448F, 1.0F, 1.0F, 1.0F)
          horizontalLineToRelative(6.062F)
          close()        
      }
    }
    return _dataPie20!!
  }

private var _dataPie20: ImageVector? = null
