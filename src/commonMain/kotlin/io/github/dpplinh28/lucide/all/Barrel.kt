package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Barrel") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10f, 3f)
                arcToRelative(41f, 41f, 0f, false, false, 0f, 18f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 3f)
                arcToRelative(41f, 41f, 0f, false, true, 0f, 18f)
            }
            lucidePath(strokeWidth) {
                moveTo(17f, 3f)
                arcToRelative(2f, 2f, 0f, false, true, 1.68f, .92f)
                arcToRelative(15.25f, 15.25f, 0f, false, true, 0f, 16.16f)
                arcTo(2f, 2f, 0f, false, true, 17f, 21f)
                horizontalLineTo(7f)
                arcToRelative(2f, 2f, 0f, false, true, -1.68f, -.92f)
                arcToRelative(15.25f, 15.25f, 0f, false, true, 0f, -16.16f)
                arcTo(2f, 2f, 0f, false, true, 7f, 3f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(3.84f, 17f)
                horizontalLineToRelative(16.32f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.84f, 7f)
                horizontalLineToRelative(16.32f)
            }
}

public val LucideIcons.All.BarrelDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Barrel: ImageVector
    @Composable get() = BarrelDefinition.asImageVector()
