package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.ChatAdd16: ImageVector
  get() {
    if (_chatAdd16 != null) {
      return _chatAdd16!!
    }
    _chatAdd16 = fluentIcon(name = "Filled.ChatAdd16", 16f) {
      materialPath {
          moveTo(8.0F, 2.0F)
          curveToRelative(3.314F, 0.0F, 6.0F, 2.686F, 6.0F, 6.0F)
          reflectiveCurveToRelative(-2.686F, 6.0F, -6.0F, 6.0F)
          curveToRelative(-1.094F, 0.0F, -2.12F, -0.293F, -3.004F, -0.805F)
          lineToRelative(-2.338F, 0.78F)
          curveToRelative(-0.176F, 0.058F, -0.37F, 0.014F, -0.504F, -0.114F)
          reflectiveCurveToRelative(-0.186F, -0.32F, -0.135F, -0.498F)
          lineToRelative(0.712F, -2.491F)
          curveTo(2.265F, 10.019F, 2.0F, 9.04F, 2.0F, 8.0F)
          curveToRelative(0.0F, -3.314F, 2.686F, -6.0F, 6.0F, -6.0F)
          close()
          moveToRelative(0.5F, 3.5F)
          curveTo(8.5F, 5.224F, 8.276F, 5.0F, 8.0F, 5.0F)
          reflectiveCurveTo(7.5F, 5.224F, 7.5F, 5.5F)
          verticalLineToRelative(2.0F)
          horizontalLineToRelative(-2.0F)
          curveTo(5.224F, 7.5F, 5.0F, 7.724F, 5.0F, 8.0F)
          reflectiveCurveToRelative(0.224F, 0.5F, 0.5F, 0.5F)
          horizontalLineToRelative(2.0F)
          verticalLineToRelative(2.0F)
          curveTo(7.5F, 10.776F, 7.724F, 11.0F, 8.0F, 11.0F)
          reflectiveCurveToRelative(0.5F, -0.224F, 0.5F, -0.5F)
          verticalLineToRelative(-2.0F)
          horizontalLineToRelative(2.0F)
          curveTo(10.776F, 8.5F, 11.0F, 8.276F, 11.0F, 8.0F)
          reflectiveCurveToRelative(-0.224F, -0.5F, -0.5F, -0.5F)
          horizontalLineToRelative(-2.0F)
          verticalLineToRelative(-2.0F)
          close()        
      }
    }
    return _chatAdd16!!
  }

private var _chatAdd16: ImageVector? = null
