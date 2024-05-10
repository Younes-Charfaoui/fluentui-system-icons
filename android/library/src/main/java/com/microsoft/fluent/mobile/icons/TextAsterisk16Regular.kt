package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.TextAsterisk16: ImageVector
  get() {
    if (_textAsterisk16 != null) {
      return _textAsterisk16!!
    }
    _textAsterisk16 = fluentIcon(name = "Regular.TextAsterisk16", 16f) {
      materialPath {
          moveTo(13.5F, 7.5F)
          horizontalLineTo(9.207F)
          lineToRelative(3.036F, -3.036F)
          curveToRelative(0.195F, -0.195F, 0.195F, -0.512F, 0.0F, -0.707F)
          curveToRelative(-0.195F, -0.195F, -0.512F, -0.195F, -0.707F, 0.0F)
          lineTo(8.5F, 6.793F)
          verticalLineTo(2.5F)
          curveTo(8.5F, 2.224F, 8.276F, 2.0F, 8.0F, 2.0F)
          reflectiveCurveTo(7.5F, 2.224F, 7.5F, 2.5F)
          verticalLineToRelative(4.293F)
          lineTo(4.464F, 3.757F)
          curveToRelative(-0.195F, -0.195F, -0.512F, -0.195F, -0.707F, 0.0F)
          curveToRelative(-0.195F, 0.195F, -0.195F, 0.512F, 0.0F, 0.707F)
          lineTo(6.793F, 7.5F)
          horizontalLineTo(2.5F)
          curveTo(2.224F, 7.5F, 2.0F, 7.724F, 2.0F, 8.0F)
          reflectiveCurveToRelative(0.224F, 0.5F, 0.5F, 0.5F)
          horizontalLineToRelative(4.293F)
          lineToRelative(-3.036F, 3.036F)
          curveToRelative(-0.195F, 0.195F, -0.195F, 0.512F, 0.0F, 0.707F)
          curveToRelative(0.098F, 0.098F, 0.226F, 0.146F, 0.354F, 0.146F)
          curveToRelative(0.128F, 0.0F, 0.256F, -0.049F, 0.354F, -0.146F)
          lineToRelative(3.036F, -3.036F)
          verticalLineTo(13.5F)
          curveToRelative(0.0F, 0.276F, 0.224F, 0.5F, 0.5F, 0.5F)
          reflectiveCurveToRelative(0.5F, -0.224F, 0.5F, -0.5F)
          verticalLineTo(9.207F)
          lineToRelative(3.036F, 3.036F)
          curveToRelative(0.098F, 0.098F, 0.226F, 0.146F, 0.354F, 0.146F)
          curveToRelative(0.128F, 0.0F, 0.256F, -0.049F, 0.354F, -0.146F)
          curveToRelative(0.195F, -0.195F, 0.195F, -0.512F, 0.0F, -0.707F)
          lineTo(9.209F, 8.5F)
          horizontalLineToRelative(4.293F)
          curveToRelative(0.276F, 0.0F, 0.5F, -0.224F, 0.5F, -0.5F)
          reflectiveCurveToRelative(-0.224F, -0.5F, -0.5F, -0.5F)
          horizontalLineTo(13.5F)
          close()        
      }
    }
    return _textAsterisk16!!
  }

private var _textAsterisk16: ImageVector? = null
