package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.ChatAdd32: ImageVector
  get() {
    if (_chatAdd32 != null) {
      return _chatAdd32!!
    }
    _chatAdd32 = fluentIcon(name = "Regular.ChatAdd32", 32f) {
      materialPath {
          moveTo(16.0F, 9.0F)
          curveToRelative(-0.552F, 0.0F, -1.0F, 0.448F, -1.0F, 1.0F)
          verticalLineToRelative(5.0F)
          horizontalLineToRelative(-5.0F)
          curveToRelative(-0.552F, 0.0F, -1.0F, 0.448F, -1.0F, 1.0F)
          reflectiveCurveToRelative(0.448F, 1.0F, 1.0F, 1.0F)
          horizontalLineToRelative(5.0F)
          verticalLineToRelative(5.0F)
          curveToRelative(0.0F, 0.552F, 0.448F, 1.0F, 1.0F, 1.0F)
          reflectiveCurveToRelative(1.0F, -0.448F, 1.0F, -1.0F)
          verticalLineToRelative(-5.0F)
          horizontalLineToRelative(5.0F)
          curveToRelative(0.552F, 0.0F, 1.0F, -0.448F, 1.0F, -1.0F)
          reflectiveCurveToRelative(-0.448F, -1.0F, -1.0F, -1.0F)
          horizontalLineToRelative(-5.0F)
          verticalLineToRelative(-5.0F)
          curveToRelative(0.0F, -0.552F, -0.448F, -1.0F, -1.0F, -1.0F)
          close()
          moveToRelative(0.0F, -7.0F)
          curveTo(8.268F, 2.0F, 2.0F, 8.268F, 2.0F, 16.0F)
          curveToRelative(0.0F, 2.37F, 0.59F, 4.605F, 1.63F, 6.563F)
          lineTo(2.06F, 28.09F)
          curveToRelative(-0.321F, 1.13F, 0.723F, 2.175F, 1.853F, 1.853F)
          lineToRelative(5.528F, -1.572F)
          curveTo(11.398F, 29.411F, 13.632F, 30.0F, 16.0F, 30.0F)
          curveToRelative(7.732F, 0.0F, 14.0F, -6.268F, 14.0F, -14.0F)
          reflectiveCurveTo(23.732F, 2.0F, 16.0F, 2.0F)
          close()
          moveTo(4.0F, 16.0F)
          curveTo(4.0F, 9.373F, 9.373F, 4.0F, 16.0F, 4.0F)
          curveToRelative(6.628F, 0.0F, 12.0F, 5.373F, 12.0F, 12.0F)
          reflectiveCurveToRelative(-5.372F, 12.0F, -12.0F, 12.0F)
          curveToRelative(-2.164F, 0.0F, -4.19F, -0.572F, -5.942F, -1.572F)
          curveToRelative(-0.233F, -0.133F, -0.51F, -0.167F, -0.769F, -0.093F)
          lineToRelative(-5.06F, 1.439F)
          lineToRelative(1.438F, -5.06F)
          curveToRelative(0.074F, -0.258F, 0.04F, -0.536F, -0.094F, -0.77F)
          curveTo(4.573F, 20.194F, 4.0F, 18.165F, 4.0F, 16.0F)
          close()        
      }
    }
    return _chatAdd32!!
  }

private var _chatAdd32: ImageVector? = null
