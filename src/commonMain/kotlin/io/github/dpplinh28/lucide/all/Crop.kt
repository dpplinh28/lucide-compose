package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Crop") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6f, 2f)
                verticalLineToRelative(14f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(14f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 22f)
                verticalLineTo(8f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                horizontalLineTo(2f)
            }
}

public val LucideIcons.All.CropDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Crop: ImageVector
    @Composable get() = CropDefinition.asImageVector()
