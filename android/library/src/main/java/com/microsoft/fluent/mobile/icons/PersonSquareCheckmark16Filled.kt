package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.PersonSquareCheckmark16: ImageVector
  get() {
    if (_personSquareCheckmark16 != null) {
      return _personSquareCheckmark16!!
    }
    _personSquareCheckmark16 = fluentIcon(name = "Filled.PersonSquareCheckmark16", 16f) {
      materialPath {
          moveTo(3.5F, 1.0F)
          curveTo(2.12F, 1.0F, 1.0F, 2.12F, 1.0F, 3.5F)
          verticalLineToRelative(7.0F)
          curveTo(1.0F, 11.88F, 2.12F, 13.0F, 3.5F, 13.0F)
          horizontalLineToRelative(2.707F)
          curveTo(6.072F, 12.523F, 6.0F, 12.02F, 6.0F, 11.5F)
          curveToRelative(0.0F, -0.37F, 0.037F, -0.733F, 0.107F, -1.083F)
          curveToRelative(-1.4F, -0.285F, -1.87F, -1.258F, -2.027F, -2.171F)
          curveTo(3.962F, 7.566F, 4.56F, 7.0F, 5.25F, 7.0F)
          horizontalLineToRelative(3.087F)
          curveToRelative(0.895F, -0.63F, 1.986F, -1.0F, 3.163F, -1.0F)
          curveToRelative(0.52F, 0.0F, 1.023F, 0.072F, 1.5F, 0.207F)
          verticalLineTo(3.5F)
          curveTo(13.0F, 2.12F, 11.88F, 1.0F, 10.5F, 1.0F)
          horizontalLineToRelative(-7.0F)
          close()
          moveTo(7.0F, 6.0F)
          curveTo(6.172F, 6.0F, 5.5F, 5.328F, 5.5F, 4.5F)
          reflectiveCurveTo(6.172F, 3.0F, 7.0F, 3.0F)
          reflectiveCurveToRelative(1.5F, 0.672F, 1.5F, 1.5F)
          reflectiveCurveTo(7.828F, 6.0F, 7.0F, 6.0F)
          close()
          moveToRelative(9.0F, 5.5F)
          curveToRelative(0.0F, 2.485F, -2.015F, 4.5F, -4.5F, 4.5F)
          reflectiveCurveTo(7.0F, 13.985F, 7.0F, 11.5F)
          reflectiveCurveTo(9.015F, 7.0F, 11.5F, 7.0F)
          reflectiveCurveTo(16.0F, 9.015F, 16.0F, 11.5F)
          close()
          moveToRelative(-2.146F, -1.854F)
          curveToRelative(-0.196F, -0.195F, -0.512F, -0.195F, -0.708F, 0.0F)
          lineTo(10.5F, 12.293F)
          lineToRelative(-0.646F, -0.647F)
          curveToRelative(-0.196F, -0.195F, -0.512F, -0.195F, -0.707F, 0.0F)
          curveToRelative(-0.196F, 0.196F, -0.196F, 0.512F, 0.0F, 0.708F)
          lineToRelative(1.0F, 1.0F)
          curveToRelative(0.195F, 0.195F, 0.511F, 0.195F, 0.707F, 0.0F)
          lineToRelative(3.0F, -3.0F)
          curveToRelative(0.195F, -0.196F, 0.195F, -0.512F, 0.0F, -0.707F)
          close()        
      }
    }
    return _personSquareCheckmark16!!
  }

private var _personSquareCheckmark16: ImageVector? = null
