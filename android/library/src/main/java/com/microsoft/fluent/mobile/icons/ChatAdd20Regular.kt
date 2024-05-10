package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.ChatAdd20: ImageVector
  get() {
    if (_chatAdd20 != null) {
      return _chatAdd20!!
    }
    _chatAdd20 = fluentIcon(name = "Regular.ChatAdd20", 20f) {
      materialPath {
          moveTo(6.5F, 9.5F)
          curveTo(6.224F, 9.5F, 6.0F, 9.724F, 6.0F, 10.0F)
          reflectiveCurveToRelative(0.224F, 0.5F, 0.5F, 0.5F)
          horizontalLineToRelative(3.0F)
          verticalLineToRelative(3.0F)
          curveToRelative(0.0F, 0.276F, 0.224F, 0.5F, 0.5F, 0.5F)
          reflectiveCurveToRelative(0.5F, -0.224F, 0.5F, -0.5F)
          verticalLineToRelative(-3.0F)
          horizontalLineToRelative(3.0F)
          curveToRelative(0.276F, 0.0F, 0.5F, -0.224F, 0.5F, -0.5F)
          reflectiveCurveToRelative(-0.224F, -0.5F, -0.5F, -0.5F)
          horizontalLineToRelative(-3.0F)
          verticalLineToRelative(-3.0F)
          curveTo(10.5F, 6.224F, 10.276F, 6.0F, 10.0F, 6.0F)
          reflectiveCurveTo(9.5F, 6.224F, 9.5F, 6.5F)
          verticalLineToRelative(3.0F)
          horizontalLineToRelative(-3.0F)
          close()
          moveTo(18.0F, 10.0F)
          curveToRelative(0.0F, -4.418F, -3.582F, -8.0F, -8.0F, -8.0F)
          reflectiveCurveToRelative(-8.0F, 3.582F, -8.0F, 8.0F)
          lineToRelative(0.007F, 0.346F)
          lineToRelative(0.026F, 0.382F)
          curveToRelative(0.091F, 1.014F, 0.374F, 1.99F, 0.829F, 2.887F)
          lineToRelative(0.063F, 0.12F)
          lineToRelative(-0.91F, 3.644F)
          lineTo(2.0F, 17.462F)
          verticalLineToRelative(0.082F)
          curveToRelative(0.025F, 0.293F, 0.31F, 0.518F, 0.62F, 0.441F)
          lineToRelative(3.645F, -0.91F)
          lineToRelative(0.12F, 0.064F)
          curveTo(7.497F, 17.702F, 8.727F, 18.0F, 10.0F, 18.0F)
          curveToRelative(4.418F, 0.0F, 8.0F, -3.582F, 8.0F, -8.0F)
          close()
          moveTo(3.0F, 10.0F)
          curveToRelative(0.0F, -3.866F, 3.134F, -7.0F, 7.0F, -7.0F)
          reflectiveCurveToRelative(7.0F, 3.134F, 7.0F, 7.0F)
          reflectiveCurveToRelative(-3.134F, 7.0F, -7.0F, 7.0F)
          curveToRelative(-1.216F, 0.0F, -2.386F, -0.31F, -3.423F, -0.892F)
          lineTo(6.49F, 16.069F)
          lineTo(6.4F, 16.048F)
          curveToRelative(-0.062F, -0.008F, -0.126F, -0.005F, -0.188F, 0.01F)
          lineToRelative(-3.024F, 0.754F)
          lineToRelative(0.756F, -3.02F)
          lineToRelative(0.014F, -0.095F)
          curveToRelative(0.005F, -0.094F, -0.016F, -0.189F, -0.063F, -0.272F)
          curveTo(3.31F, 12.388F, 3.0F, 11.217F, 3.0F, 10.0F)
          close()        
      }
    }
    return _chatAdd20!!
  }

private var _chatAdd20: ImageVector? = null
