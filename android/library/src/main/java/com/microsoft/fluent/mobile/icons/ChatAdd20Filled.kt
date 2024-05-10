package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.ChatAdd20: ImageVector
  get() {
    if (_chatAdd20 != null) {
      return _chatAdd20!!
    }
    _chatAdd20 = fluentIcon(name = "Filled.ChatAdd20", 20f) {
      materialPath {
          moveTo(10.0F, 2.0F)
          curveToRelative(4.418F, 0.0F, 8.0F, 3.582F, 8.0F, 8.0F)
          reflectiveCurveToRelative(-3.582F, 8.0F, -8.0F, 8.0F)
          curveToRelative(-1.273F, 0.0F, -2.504F, -0.298F, -3.613F, -0.86F)
          lineToRelative(-0.121F, -0.065F)
          lineToRelative(-3.645F, 0.91F)
          curveToRelative(-0.31F, 0.078F, -0.595F, -0.148F, -0.62F, -0.441F)
          verticalLineToRelative(-0.082F)
          lineToRelative(0.014F, -0.083F)
          lineToRelative(0.91F, -3.644F)
          lineToRelative(-0.063F, -0.12F)
          curveToRelative(-0.455F, -0.896F, -0.738F, -1.873F, -0.83F, -2.887F)
          lineToRelative(-0.025F, -0.382F)
          lineTo(2.0F, 10.0F)
          curveToRelative(0.0F, -4.418F, 3.582F, -8.0F, 8.0F, -8.0F)
          close()
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
      }
    }
    return _chatAdd20!!
  }

private var _chatAdd20: ImageVector? = null
