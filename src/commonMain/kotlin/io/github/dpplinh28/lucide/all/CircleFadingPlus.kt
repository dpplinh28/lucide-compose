package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CircleFadingPlus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 2f)
                arcToRelative(10f, 10f, 0f, false, true, 7.38f, 16.75f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 8f)
                verticalLineToRelative(8f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 12f)
                horizontalLineTo(8f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.5f, 8.875f)
                arcToRelative(10f, 10f, 0f, false, false, -.5f, 3f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.83f, 16f)
                arcToRelative(10f, 10f, 0f, false, false, 2.43f, 3.4f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.636f, 5.235f)
                arcToRelative(10f, 10f, 0f, false, true, .891f, -.857f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.644f, 21.42f)
                arcToRelative(10f, 10f, 0f, false, false, 7.631f, -.38f)
            }
}

public val LucideIcons.All.CircleFadingPlusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CircleFadingPlus: ImageVector
    @Composable get() = CircleFadingPlusDefinition.asImageVector()
