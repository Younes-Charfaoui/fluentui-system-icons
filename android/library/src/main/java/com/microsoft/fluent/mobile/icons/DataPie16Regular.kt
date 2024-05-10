package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.DataPie16: ImageVector
  get() {
    if (_dataPie16 != null) {
      return _dataPie16!!
    }
    _dataPie16 = fluentIcon(name = "Regular.DataPie16", 16f) {
      materialPath {
          moveTo(8.5F, 1.0F)
          curveTo(8.224F, 1.0F, 8.0F, 1.224F, 8.0F, 1.5F)
          verticalLineToRelative(6.0F)
          curveTo(8.0F, 7.776F, 8.224F, 8.0F, 8.5F, 8.0F)
          horizontalLineToRelative(6.0F)
          curveTo(14.776F, 8.0F, 15.0F, 7.776F, 15.0F, 7.5F)
          curveTo(15.0F, 3.91F, 12.09F, 1.0F, 8.5F, 1.0F)
          close()
          moveTo(9.0F, 7.0F)
          verticalLineTo(2.022F)
          curveTo(11.639F, 2.26F, 13.74F, 4.362F, 13.978F, 7.0F)
          horizontalLineTo(9.0F)
          close()
          moveTo(7.0F, 3.522F)
          curveToRelative(0.0F, -0.14F, -0.059F, -0.274F, -0.163F, -0.369F)
          curveTo(6.734F, 3.06F, 6.595F, 3.012F, 6.455F, 3.025F)
          curveTo(3.397F, 3.3F, 1.0F, 5.87F, 1.0F, 9.0F)
          curveToRelative(0.0F, 3.314F, 2.686F, 6.0F, 6.0F, 6.0F)
          curveToRelative(3.13F, 0.0F, 5.7F, -2.396F, 5.976F, -5.455F)
          curveToRelative(0.012F, -0.14F, -0.035F, -0.279F, -0.13F, -0.382F)
          curveTo(12.753F, 9.059F, 12.619F, 9.0F, 12.479F, 9.0F)
          horizontalLineTo(7.0F)
          verticalLineTo(3.522F)
          close()
          moveTo(2.0F, 9.0F)
          curveToRelative(0.0F, -2.419F, 1.718F, -4.437F, 4.0F, -4.9F)
          verticalLineToRelative(5.4F)
          curveTo(6.0F, 9.776F, 6.224F, 10.0F, 6.5F, 10.0F)
          horizontalLineToRelative(5.4F)
          curveToRelative(-0.463F, 2.282F, -2.481F, 4.0F, -4.9F, 4.0F)
          curveToRelative(-2.761F, 0.0F, -5.0F, -2.239F, -5.0F, -5.0F)
          close()        
      }
    }
    return _dataPie16!!
  }

private var _dataPie16: ImageVector? = null
