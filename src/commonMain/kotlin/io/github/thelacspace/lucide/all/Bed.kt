package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Bed") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2f, 4f)
                verticalLineToRelative(16f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 8f)
                horizontalLineToRelative(18f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(10f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 17f)
                horizontalLineToRelative(20f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 8f)
                verticalLineToRelative(9f)
            }
}

public val LucideIcons.All.BedDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Bed: ImageVector
    @Composable get() = BedDefinition.asImageVector()
