package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.ChatAdd24: ImageVector
  get() {
    if (_chatAdd24 != null) {
      return _chatAdd24!!
    }
    _chatAdd24 = fluentIcon(name = "Filled.ChatAdd24", 24f) {
      materialPath {
          moveTo(12.0F, 2.0F)
          curveToRelative(5.523F, 0.0F, 10.0F, 4.477F, 10.0F, 10.0F)
          reflectiveCurveToRelative(-4.477F, 10.0F, -10.0F, 10.0F)
          curveToRelative(-1.64F, 0.0F, -3.225F, -0.396F, -4.644F, -1.142F)
          lineToRelative(-4.29F, 1.117F)
          curveToRelative(-0.455F, 0.119F, -0.92F, -0.154F, -1.037F, -0.608F)
          curveToRelative(-0.037F, -0.14F, -0.037F, -0.288F, 0.0F, -0.428F)
          lineToRelative(1.116F, -4.289F)
          curveTo(2.397F, 15.23F, 2.0F, 13.643F, 2.0F, 12.0F)
          curveTo(2.0F, 6.477F, 6.477F, 2.0F, 12.0F, 2.0F)
          close()
          moveToRelative(0.75F, 5.75F)
          curveTo(12.75F, 7.336F, 12.414F, 7.0F, 12.0F, 7.0F)
          reflectiveCurveToRelative(-0.75F, 0.336F, -0.75F, 0.75F)
          verticalLineToRelative(3.5F)
          horizontalLineToRelative(-3.5F)
          curveTo(7.336F, 11.25F, 7.0F, 11.586F, 7.0F, 12.0F)
          reflectiveCurveToRelative(0.336F, 0.75F, 0.75F, 0.75F)
          horizontalLineToRelative(3.5F)
          verticalLineToRelative(3.5F)
          curveToRelative(0.0F, 0.414F, 0.336F, 0.75F, 0.75F, 0.75F)
          reflectiveCurveToRelative(0.75F, -0.336F, 0.75F, -0.75F)
          verticalLineToRelative(-3.5F)
          horizontalLineToRelative(3.5F)
          curveToRelative(0.414F, 0.0F, 0.75F, -0.336F, 0.75F, -0.75F)
          reflectiveCurveToRelative(-0.336F, -0.75F, -0.75F, -0.75F)
          horizontalLineToRelative(-3.5F)
          verticalLineToRelative(-3.5F)
          close()        
      }
    }
    return _chatAdd24!!
  }

private var _chatAdd24: ImageVector? = null
