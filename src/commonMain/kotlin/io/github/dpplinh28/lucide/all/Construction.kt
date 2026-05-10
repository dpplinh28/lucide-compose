package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Construction") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.0f, 6.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, 1.0f, 0.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, -1.0f, 0.0f)
                horizontalLineToRelative(-18.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, -1.0f, -0.0f)
                verticalLineToRelative(-8.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, 1.0f, -0.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(17f, 14f)
                verticalLineToRelative(7f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 14f)
                verticalLineToRelative(7f)
            }
            lucidePath(strokeWidth) {
                moveTo(17f, 3f)
                verticalLineToRelative(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 3f)
                verticalLineToRelative(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(10f, 14f)
                lineTo(2.3f, 6.3f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(14f, 6f)
                lineToRelative(7.7f, 7.7f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(8f, 6f)
                lineToRelative(8f, 8f)
            }
}

public val LucideIcons.All.ConstructionDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Construction: ImageVector
    @Composable get() = ConstructionDefinition.asImageVector()
