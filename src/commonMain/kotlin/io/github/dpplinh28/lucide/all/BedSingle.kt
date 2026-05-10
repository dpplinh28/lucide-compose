package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BedSingle") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3f, 20f)
                verticalLineToRelative(-8f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(14f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(8f)
            }
            lucidePath(strokeWidth) {
                moveTo(5f, 10f)
                verticalLineTo(6f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(10f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 18f)
                horizontalLineToRelative(18f)
            }
}

public val LucideIcons.All.BedSingleDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BedSingle: ImageVector
    @Composable get() = BedSingleDefinition.asImageVector()
