package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Merge") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(8f, 6f)
                lineToRelative(4f, -4f)
                lineToRelative(4f, 4f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 2f)
                verticalLineToRelative(10.3f)
                arcToRelative(4f, 4f, 0f, false, true, -1.172f, 2.872f)
                lineTo(4f, 22f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(20f, 22f)
                lineToRelative(-5f, -5f)
            }
}

public val LucideIcons.All.MergeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Merge: ImageVector
    @Composable get() = MergeDefinition.asImageVector()
