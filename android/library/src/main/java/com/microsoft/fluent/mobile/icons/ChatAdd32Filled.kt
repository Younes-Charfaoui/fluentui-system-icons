package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.ChatAdd32: ImageVector
  get() {
    if (_chatAdd32 != null) {
      return _chatAdd32!!
    }
    _chatAdd32 = fluentIcon(name = "Filled.ChatAdd32", 32f) {
      materialPath {
          moveTo(16.0F, 2.0F)
          curveToRelative(7.732F, 0.0F, 14.0F, 6.268F, 14.0F, 14.0F)
          reflectiveCurveToRelative(-6.268F, 14.0F, -14.0F, 14.0F)
          curveToRelative(-2.368F, 0.0F, -4.602F, -0.589F, -6.56F, -1.629F)
          lineToRelative(-5.528F, 1.572F)
          curveToRelative(-1.13F, 0.322F, -2.174F, -0.723F, -1.853F, -1.853F)
          lineToRelative(1.572F, -5.527F)
          curveTo(2.59F, 20.605F, 2.0F, 18.37F, 2.0F, 16.0F)
          curveTo(2.0F, 8.268F, 8.267F, 2.0F, 16.0F, 2.0F)
          close()
          moveToRelative(0.0F, 7.0F)
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
      }
    }
    return _chatAdd32!!
  }

private var _chatAdd32: ImageVector? = null
