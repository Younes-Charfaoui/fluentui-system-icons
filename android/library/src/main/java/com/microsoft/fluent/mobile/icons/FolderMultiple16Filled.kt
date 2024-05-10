package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.FolderMultiple16: ImageVector
  get() {
    if (_folderMultiple16 != null) {
      return _folderMultiple16!!
    }
    _folderMultiple16 = fluentIcon(name = "Filled.FolderMultiple16", 16f) {
      materialPath {
          moveTo(6.146F, 2.44F)
          lineTo(7.0F, 3.292F)
          lineToRelative(-1.56F, 1.56F)
          curveTo(5.345F, 4.948F, 5.217F, 5.0F, 5.085F, 5.0F)
          horizontalLineTo(1.0F)
          verticalLineTo(4.5F)
          curveTo(1.0F, 3.12F, 2.12F, 2.0F, 3.5F, 2.0F)
          horizontalLineToRelative(1.586F)
          curveToRelative(0.398F, 0.0F, 0.78F, 0.158F, 1.06F, 0.44F)
          close()
          moveTo(1.0F, 9.5F)
          verticalLineTo(6.0F)
          horizontalLineToRelative(4.086F)
          curveToRelative(0.398F, 0.0F, 0.78F, -0.158F, 1.06F, -0.44F)
          lineTo(8.207F, 3.5F)
          horizontalLineTo(10.5F)
          curveTo(11.88F, 3.5F, 13.0F, 4.62F, 13.0F, 6.0F)
          verticalLineToRelative(3.5F)
          curveToRelative(0.0F, 1.38F, -1.12F, 2.5F, -2.5F, 2.5F)
          horizontalLineToRelative(-7.0F)
          curveTo(2.12F, 12.0F, 1.0F, 10.88F, 1.0F, 9.5F)
          close()
          moveTo(14.0F, 6.0F)
          verticalLineToRelative(3.5F)
          curveToRelative(0.0F, 1.933F, -1.567F, 3.5F, -3.5F, 3.5F)
          horizontalLineToRelative(-7.0F)
          curveToRelative(0.456F, 0.607F, 1.182F, 1.0F, 2.0F, 1.0F)
          horizontalLineToRelative(5.0F)
          curveToRelative(2.486F, 0.0F, 4.5F, -2.014F, 4.5F, -4.5F)
          verticalLineTo(8.0F)
          curveToRelative(0.0F, -0.818F, -0.393F, -1.544F, -1.0F, -2.0F)
          close()        
      }
    }
    return _folderMultiple16!!
  }

private var _folderMultiple16: ImageVector? = null
