package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.ChatWarning24: ImageVector
  get() {
    if (_chatWarning24 != null) {
      return _chatWarning24!!
    }
    _chatWarning24 = fluentIcon(name = "Regular.ChatWarning24", 24f) {
      materialPath {
          moveTo(12.0F, 6.5F)
          curveToRelative(0.414F, 0.0F, 0.75F, 0.336F, 0.75F, 0.75F)
          verticalLineToRelative(6.25F)
          curveToRelative(0.0F, 0.414F, -0.336F, 0.75F, -0.75F, 0.75F)
          reflectiveCurveToRelative(-0.75F, -0.336F, -0.75F, -0.75F)
          verticalLineTo(7.25F)
          curveToRelative(0.0F, -0.414F, 0.336F, -0.75F, 0.75F, -0.75F)
          close()
          moveToRelative(0.0F, 10.998F)
          curveToRelative(0.552F, 0.0F, 1.0F, -0.448F, 1.0F, -1.0F)
          curveToRelative(0.0F, -0.553F, -0.448F, -1.0F, -1.0F, -1.0F)
          reflectiveCurveToRelative(-1.0F, 0.447F, -1.0F, 1.0F)
          curveToRelative(0.0F, 0.552F, 0.448F, 1.0F, 1.0F, 1.0F)
          close()
          moveTo(12.0F, 2.0F)
          curveToRelative(5.523F, 0.0F, 10.0F, 4.477F, 10.0F, 10.0F)
          reflectiveCurveToRelative(-4.477F, 10.0F, -10.0F, 10.0F)
          curveToRelative(-1.618F, 0.0F, -3.182F, -0.385F, -4.587F, -1.112F)
          lineToRelative(-3.826F, 1.067F)
          curveToRelative(-0.665F, 0.186F, -1.354F, -0.202F, -1.54F, -0.867F)
          curveToRelative(-0.062F, -0.22F, -0.062F, -0.453F, 0.0F, -0.673F)
          lineToRelative(1.068F, -3.823F)
          curveTo(2.386F, 15.186F, 2.0F, 13.62F, 2.0F, 12.0F)
          curveTo(2.0F, 6.477F, 6.477F, 2.0F, 12.0F, 2.0F)
          close()
          moveToRelative(0.0F, 1.5F)
          curveToRelative(-4.694F, 0.0F, -8.5F, 3.806F, -8.5F, 8.5F)
          curveToRelative(0.0F, 1.47F, 0.373F, 2.883F, 1.073F, 4.137F)
          lineToRelative(0.15F, 0.27F)
          lineToRelative(-1.112F, 3.984F)
          lineToRelative(3.986F, -1.112F)
          lineToRelative(0.27F, 0.15F)
          curveTo(9.12F, 20.13F, 10.532F, 20.5F, 12.0F, 20.5F)
          curveToRelative(4.694F, 0.0F, 8.5F, -3.806F, 8.5F, -8.5F)
          reflectiveCurveTo(16.694F, 3.5F, 12.0F, 3.5F)
          close()        
      }
    }
    return _chatWarning24!!
  }

private var _chatWarning24: ImageVector? = null
