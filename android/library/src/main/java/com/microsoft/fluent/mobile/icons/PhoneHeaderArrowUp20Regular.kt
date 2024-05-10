package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.PhoneHeaderArrowUp20: ImageVector
  get() {
    if (_phoneHeaderArrowUp20 != null) {
      return _phoneHeaderArrowUp20!!
    }
    _phoneHeaderArrowUp20 = fluentIcon(name = "Regular.PhoneHeaderArrowUp20", 20f) {
      materialPath {
          moveTo(7.0F, 4.5F)
          curveTo(7.0F, 4.224F, 7.224F, 4.0F, 7.5F, 4.0F)
          horizontalLineToRelative(5.0F)
          curveTo(12.776F, 4.0F, 13.0F, 4.224F, 13.0F, 4.5F)
          reflectiveCurveTo(12.776F, 5.0F, 12.5F, 5.0F)
          horizontalLineToRelative(-5.0F)
          curveTo(7.224F, 5.0F, 7.0F, 4.776F, 7.0F, 4.5F)
          close()
          moveTo(5.0F, 4.0F)
          curveToRelative(0.0F, -1.105F, 0.895F, -2.0F, 2.0F, -2.0F)
          horizontalLineToRelative(6.0F)
          curveToRelative(1.105F, 0.0F, 2.0F, 0.895F, 2.0F, 2.0F)
          verticalLineToRelative(12.0F)
          curveToRelative(0.0F, 1.105F, -0.895F, 2.0F, -2.0F, 2.0F)
          horizontalLineTo(7.0F)
          curveToRelative(-1.105F, 0.0F, -2.0F, -0.895F, -2.0F, -2.0F)
          verticalLineTo(4.0F)
          close()
          moveToRelative(2.0F, -1.0F)
          curveTo(6.448F, 3.0F, 6.0F, 3.448F, 6.0F, 4.0F)
          verticalLineToRelative(12.0F)
          curveToRelative(0.0F, 0.552F, 0.448F, 1.0F, 1.0F, 1.0F)
          horizontalLineToRelative(6.0F)
          curveToRelative(0.552F, 0.0F, 1.0F, -0.448F, 1.0F, -1.0F)
          verticalLineTo(4.0F)
          curveToRelative(0.0F, -0.552F, -0.448F, -1.0F, -1.0F, -1.0F)
          horizontalLineTo(7.0F)
          close()
          moveToRelative(5.354F, 5.146F)
          lineToRelative(-2.0F, -2.0F)
          lineToRelative(-0.003F, -0.002F)
          curveToRelative(-0.047F, -0.047F, -0.102F, -0.082F, -0.16F, -0.106F)
          curveTo(10.133F, 6.014F, 10.07F, 6.0F, 10.003F, 6.0F)
          horizontalLineTo(9.997F)
          curveTo(9.93F, 6.0F, 9.867F, 6.014F, 9.809F, 6.038F)
          curveToRelative(-0.06F, 0.024F, -0.115F, 0.06F, -0.162F, 0.108F)
          lineToRelative(-2.0F, 2.0F)
          curveToRelative(-0.196F, 0.196F, -0.196F, 0.512F, 0.0F, 0.707F)
          curveToRelative(0.195F, 0.196F, 0.511F, 0.196F, 0.707F, 0.0F)
          lineTo(9.5F, 7.708F)
          verticalLineTo(10.5F)
          curveToRelative(0.0F, 0.276F, 0.224F, 0.5F, 0.5F, 0.5F)
          reflectiveCurveToRelative(0.5F, -0.224F, 0.5F, -0.5F)
          verticalLineTo(7.707F)
          lineToRelative(1.146F, 1.147F)
          curveToRelative(0.196F, 0.195F, 0.512F, 0.195F, 0.708F, 0.0F)
          curveToRelative(0.195F, -0.196F, 0.195F, -0.512F, 0.0F, -0.707F)
          close()        
      }
    }
    return _phoneHeaderArrowUp20!!
  }

private var _phoneHeaderArrowUp20: ImageVector? = null
