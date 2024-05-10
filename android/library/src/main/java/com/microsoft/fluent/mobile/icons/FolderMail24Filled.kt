package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.FolderMail24: ImageVector
  get() {
    if (_folderMail24 != null) {
      return _folderMail24!!
    }
    _folderMail24 = fluentIcon(name = "Filled.FolderMail24", 24f) {
      materialPath {
          moveTo(2.0F, 8.0F)
          verticalLineTo(6.25F)
          curveTo(2.0F, 4.455F, 3.455F, 3.0F, 5.25F, 3.0F)
          horizontalLineToRelative(2.879F)
          curveToRelative(0.596F, 0.0F, 1.169F, 0.237F, 1.59F, 0.659F)
          lineToRelative(1.531F, 1.53F)
          lineTo(8.659F, 7.78F)
          curveTo(8.519F, 7.921F, 8.328F, 8.0F, 8.129F, 8.0F)
          horizontalLineTo(2.0F)
          close()
          moveToRelative(0.0F, 1.5F)
          verticalLineToRelative(8.25F)
          curveTo(2.0F, 19.545F, 3.455F, 21.0F, 5.25F, 21.0F)
          horizontalLineToRelative(5.92F)
          curveTo(11.06F, 20.687F, 11.0F, 20.35F, 11.0F, 20.0F)
          verticalLineToRelative(-5.0F)
          curveToRelative(0.0F, -1.657F, 1.343F, -3.0F, 3.0F, -3.0F)
          horizontalLineToRelative(7.0F)
          curveToRelative(0.35F, 0.0F, 0.687F, 0.06F, 1.0F, 0.17F)
          verticalLineTo(8.75F)
          curveToRelative(0.0F, -1.795F, -1.455F, -3.25F, -3.25F, -3.25F)
          horizontalLineToRelative(-5.69F)
          lineTo(9.72F, 8.841F)
          curveTo(9.298F, 9.263F, 8.725F, 9.5F, 8.129F, 9.5F)
          horizontalLineTo(2.0F)
          close()
          moveToRelative(10.019F, 5.224F)
          lineToRelative(5.49F, 3.203F)
          lineTo(23.0F, 14.97F)
          curveTo(22.985F, 13.88F, 22.096F, 13.0F, 21.0F, 13.0F)
          horizontalLineToRelative(-7.0F)
          curveToRelative(-1.01F, 0.0F, -1.847F, 0.75F, -1.981F, 1.724F)
          close()
          moveTo(23.0F, 16.106F)
          lineToRelative(-5.263F, 2.834F)
          curveToRelative(-0.153F, 0.083F, -0.338F, 0.08F, -0.489F, -0.008F)
          lineTo(12.0F, 15.87F)
          verticalLineTo(20.0F)
          curveToRelative(0.0F, 1.105F, 0.895F, 2.0F, 2.0F, 2.0F)
          horizontalLineToRelative(7.0F)
          curveToRelative(1.105F, 0.0F, 2.0F, -0.895F, 2.0F, -2.0F)
          verticalLineToRelative(-3.894F)
          close()        
      }
    }
    return _folderMail24!!
  }

private var _folderMail24: ImageVector? = null
