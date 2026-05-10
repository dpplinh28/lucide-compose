package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Milestone") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 13f)
                verticalLineToRelative(8f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 3f)
                verticalLineToRelative(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.172f, 6f)
                arcToRelative(2f, 2f, 0f, false, true, 1.414f, .586f)
                lineToRelative(2.06f, 2.06f)
                arcToRelative(1.207f, 1.207f, 0f, false, true, 0f, 1.708f)
                lineToRelative(-2.06f, 2.06f)
                arcToRelative(2f, 2f, 0f, false, true, -1.414f, .586f)
                horizontalLineTo(4f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineTo(7f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                close()
            }
}

public val LucideIcons.All.MilestoneDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Milestone: ImageVector
    @Composable get() = MilestoneDefinition.asImageVector()
