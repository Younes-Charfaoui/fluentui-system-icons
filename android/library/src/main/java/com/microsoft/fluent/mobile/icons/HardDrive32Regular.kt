package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.HardDrive32: ImageVector
  get() {
    if (_hardDrive32 != null) {
      return _hardDrive32!!
    }
    _hardDrive32 = fluentIcon(name = "Regular.HardDrive32", 32f) {
      materialPath {
          moveTo(6.984F, 6.797F)
          curveTo(7.534F, 5.696F, 8.66F, 5.0F, 9.89F, 5.0F)
          horizontalLineToRelative(12.218F)
          curveToRelative(1.231F, 0.0F, 2.357F, 0.696F, 2.907F, 1.797F)
          lineToRelative(4.535F, 9.07F)
          curveToRelative(0.295F, 0.59F, 0.449F, 1.24F, 0.449F, 1.9F)
          verticalLineToRelative(4.983F)
          curveToRelative(0.0F, 1.795F, -1.455F, 3.25F, -3.25F, 3.25F)
          horizontalLineTo(5.25F)
          curveTo(3.455F, 26.0F, 2.0F, 24.545F, 2.0F, 22.75F)
          verticalLineToRelative(-4.983F)
          curveToRelative(0.0F, -0.66F, 0.154F, -1.31F, 0.449F, -1.9F)
          lineToRelative(4.535F, -9.07F)
          close()
          moveTo(23.228F, 7.69F)
          curveTo(23.015F, 7.268F, 22.582F, 7.0F, 22.108F, 7.0F)
          horizontalLineTo(9.891F)
          curveTo(9.417F, 7.0F, 8.984F, 7.268F, 8.773F, 7.691F)
          lineToRelative(-3.656F, 7.312F)
          curveTo(5.16F, 15.0F, 5.205F, 15.0F, 5.25F, 15.0F)
          horizontalLineToRelative(21.5F)
          curveToRelative(0.045F, 0.0F, 0.09F, 0.0F, 0.133F, 0.003F)
          lineTo(23.228F, 7.69F)
          close()
          moveTo(4.0F, 18.25F)
          verticalLineToRelative(4.5F)
          curveTo(4.0F, 23.44F, 4.56F, 24.0F, 5.25F, 24.0F)
          horizontalLineToRelative(21.5F)
          curveToRelative(0.69F, 0.0F, 1.25F, -0.56F, 1.25F, -1.25F)
          verticalLineToRelative(-4.5F)
          curveToRelative(0.0F, -0.69F, -0.56F, -1.25F, -1.25F, -1.25F)
          horizontalLineTo(5.25F)
          curveTo(4.56F, 17.0F, 4.0F, 17.56F, 4.0F, 18.25F)
          close()
          moveToRelative(20.5F, 3.5F)
          curveToRelative(0.69F, 0.0F, 1.25F, -0.56F, 1.25F, -1.25F)
          reflectiveCurveToRelative(-0.56F, -1.25F, -1.25F, -1.25F)
          reflectiveCurveToRelative(-1.25F, 0.56F, -1.25F, 1.25F)
          reflectiveCurveToRelative(0.56F, 1.25F, 1.25F, 1.25F)
          close()        
      }
    }
    return _hardDrive32!!
  }

private var _hardDrive32: ImageVector? = null
