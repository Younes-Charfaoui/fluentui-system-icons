package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.ArrowSquareUpRight20: ImageVector
  get() {
    if (_arrowSquareUpRight20 != null) {
      return _arrowSquareUpRight20!!
    }
    _arrowSquareUpRight20 = fluentIcon(name = "Regular.ArrowSquareUpRight20", 20f) {
      materialPath {
          moveTo(6.0F, 3.0F)
          curveTo(4.343F, 3.0F, 3.0F, 4.343F, 3.0F, 6.0F)
          verticalLineToRelative(8.0F)
          curveToRelative(0.0F, 1.657F, 1.343F, 3.0F, 3.0F, 3.0F)
          horizontalLineToRelative(8.0F)
          curveToRelative(1.657F, 0.0F, 3.0F, -1.343F, 3.0F, -3.0F)
          verticalLineTo(6.0F)
          curveToRelative(0.0F, -1.657F, -1.343F, -3.0F, -3.0F, -3.0F)
          horizontalLineTo(6.0F)
          close()
          moveTo(4.0F, 6.0F)
          curveToRelative(0.0F, -1.105F, 0.895F, -2.0F, 2.0F, -2.0F)
          horizontalLineToRelative(8.0F)
          curveToRelative(1.105F, 0.0F, 2.0F, 0.895F, 2.0F, 2.0F)
          verticalLineToRelative(8.0F)
          curveToRelative(0.0F, 1.105F, -0.895F, 2.0F, -2.0F, 2.0F)
          horizontalLineTo(6.0F)
          curveToRelative(-1.105F, 0.0F, -2.0F, -0.895F, -2.0F, -2.0F)
          verticalLineTo(6.0F)
          close()
          moveToRelative(8.691F, 1.038F)
          curveToRelative(0.058F, 0.024F, 0.113F, 0.06F, 0.16F, 0.106F)
          lineToRelative(0.005F, 0.005F)
          curveToRelative(0.047F, 0.047F, 0.082F, 0.101F, 0.106F, 0.16F)
          curveTo(12.986F, 7.368F, 13.0F, 7.432F, 13.0F, 7.5F)
          verticalLineToRelative(5.0F)
          curveToRelative(0.0F, 0.276F, -0.224F, 0.5F, -0.5F, 0.5F)
          reflectiveCurveTo(12.0F, 12.776F, 12.0F, 12.5F)
          verticalLineTo(8.707F)
          lineToRelative(-4.146F, 4.147F)
          curveToRelative(-0.196F, 0.195F, -0.512F, 0.195F, -0.708F, 0.0F)
          curveToRelative(-0.195F, -0.196F, -0.195F, -0.512F, 0.0F, -0.708F)
          lineTo(11.293F, 8.0F)
          horizontalLineTo(7.5F)
          curveTo(7.224F, 8.0F, 7.0F, 7.776F, 7.0F, 7.5F)
          reflectiveCurveTo(7.224F, 7.0F, 7.5F, 7.0F)
          horizontalLineToRelative(5.0F)
          curveToRelative(0.068F, 0.0F, 0.132F, 0.013F, 0.191F, 0.038F)
          close()        
      }
    }
    return _arrowSquareUpRight20!!
  }

private var _arrowSquareUpRight20: ImageVector? = null
