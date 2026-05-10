package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("LocateOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 19f)
                verticalLineToRelative(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 2f)
                verticalLineToRelative(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.89f, 13.24f)
                arcToRelative(7f, 7f, 0f, false, false, -8.13f, -8.13f)
            }
            lucidePath(strokeWidth) {
                moveTo(19f, 12f)
                horizontalLineToRelative(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 12f)
                horizontalLineToRelative(3f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(2f, 2f)
                lineToRelative(20f, 20f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.05f, 7.05f)
                arcToRelative(7f, 7f, 0f, false, false, 9.9f, 9.9f)
            }
}

public val LucideIcons.All.LocateOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.LocateOff: ImageVector
    @Composable get() = LocateOffDefinition.asImageVector()
