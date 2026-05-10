package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Bike") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0f, 17.5f)
                arcToRelative(3.5f, 3.5f, 0f, true, false, 7.0f, 0f)
                arcToRelative(3.5f, 3.5f, 0f, true, false, -7.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f, 17.5f)
                arcToRelative(3.5f, 3.5f, 0f, true, false, 7.0f, 0f)
                arcToRelative(3.5f, 3.5f, 0f, true, false, -7.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0f, true, false, 2.0f, 0f)
                arcToRelative(1.0f, 1.0f, 0f, true, false, -2.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 17.5f)
                verticalLineTo(14f)
                lineToRelative(-3f, -3f)
                lineToRelative(4f, -3f)
                lineToRelative(2f, 3f)
                horizontalLineToRelative(2f)
            }
}

public val LucideIcons.All.BikeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Bike: ImageVector
    @Composable get() = BikeDefinition.asImageVector()
